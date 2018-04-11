FROM alfresco/alfresco-content-repository-community:6.0.4-ea

ARG TOMCAT_DIR=/usr/local/tomcat

RUN mkdir -p $TOMCAT_DIR/amps

COPY target/amps $TOMCAT_DIR/amps
COPY target/jars $TOMCAT_DIR/webapps/alfresco/WEB-INF/lib

RUN java -jar $TOMCAT_DIR/alfresco-mmt/alfresco-mmt*.jar install \
              $TOMCAT_DIR/amps $TOMCAT_DIR/webapps/alfresco -directory -nobackup -force

ARG ALFRESCO_DATA_DIR=$TOMCAT_DIR/alf_data

VOLUME $ALFRESCO_DATA_DIR
