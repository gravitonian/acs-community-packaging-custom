FROM alfresco/alfresco-share:6.0.a

ARG TOMCAT_DIR=/usr/local/tomcat

RUN mkdir -p $TOMCAT_DIR/amps_share

COPY target/alfresco-mmt/* $TOMCAT_DIR/alfresco-mmt/
COPY target/amps_share $TOMCAT_DIR/amps_share

RUN java -jar $TOMCAT_DIR/alfresco-mmt/alfresco-mmt*.jar install \
              $TOMCAT_DIR/amps_share $TOMCAT_DIR/webapps/share -directory -nobackup -force