FROM tomcat:9.0
MAINTAINER ThamYT <thamyt75@gmail.com>

# Copy configurations (Tomcat users, Manager app)
#ADD tomcat-users.xml /usr/local/tomcat/conf/
#ADD context.xml /usr/local/tomcat/webapps/manager/META-INF/

# Copy all the war files to the webapps
ADD ./wars/spring4-mvc.war /usr/local/tomcat/webapps/
ADD ./wars/spring5-mvc.war /usr/local/tomcat/webapps/
ADD ./wars/springboot2-mvc.war /usr/local/tomcat/webapps/
