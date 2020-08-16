package org.example.spring5_mvc.controller;

import org.example.spring5_mvc.dto.ServerDataDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Model model) {
        ServerDataDTO serverDataDTO = new ServerDataDTO();
        DateTimeFormatter dtf = DateTimeFormatter
                                .ofPattern("dd/MM/yyyy hh:mm:ss a")
                                .withZone(ZoneId.of("Asia/Singapore"));
        serverDataDTO.setClocktime(dtf.format(ZonedDateTime.now()));

        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        sdf.setTimeZone(TimeZone.getTimeZone("Asia/Singapore"));
        serverDataDTO.setClocktime(sdf.format(new Date()));
        */

        // get server network information
        try {
            InetAddress ip = InetAddress.getLocalHost();
            serverDataDTO.setIpaddr(ip.getHostAddress());
            serverDataDTO.setHostname(ip.getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        model.addAttribute("serverDataDTO", serverDataDTO);

        return "index.html";
    }
}
