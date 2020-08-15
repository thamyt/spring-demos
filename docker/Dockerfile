FROM tomcat:8.5.11
MAINTAINER ThamYT <borgymanotoy@thamyt75@gmail.com>

# Copy configurations (Tomcat users, Manager app)
ADD tomcat-users.xml /usr/local/tomcat/conf/
ADD context.xml /usr/local/tomcat/webapps/manager/META-INF/
ADD ..spring4-mvc/target/spring4-mvc.war /usr/local/tomcat/webapps/
ADD ..spring5-mvc/target/spring5-mvc.war /usr/local/tomcat/webapps/
ADD ..springboot2-mvc/target/springboot2-mvc.war /usr/local/tomcat/webapps/