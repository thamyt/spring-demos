FROM tomcat:9.0
MAINTAINER ThamYT <thamyt75@gmail.com>

# Copy configurations (Tomcat users, Manager app)
#ADD tomcat-users.xml /usr/local/tomcat/conf/
#ADD context.xml /usr/local/tomcat/webapps/manager/META-INF/

# Copy all the war files to the webapps
ADD ./wars/*.war /usr/local/tomcat/webapps/