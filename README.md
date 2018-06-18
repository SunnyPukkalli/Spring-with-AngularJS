# springAngularJS
Web Development Using Spring and AngularJS

Basic Web Development with Spring Framework

Tutorial 1 :-
basic-web-app

1) create a maven project.
2) Edit thr pom.xml with dependency management tag for consistent version of spring 
	>> Bill of materails tag from spring website
3) Add dependencies section and add required dependencies.
	>> spring-context
	>> spring-webmvc
	>> 
	
4) add build tag for plugin's.
	>> Add tomcat dependency in plugin. maven includes a java complier plugin by default.
	 <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.7.0</version>
        <configuration>
          <source>1.8</source>
          <target>1.8</target>
        </configuration>
     </plugin>
	  
	>> Add tomcat embbeded plugin 
	<plugin>
          <groupId>org.apache.tomcat.maven</groupId>
          <artifactId>tomcat7-maven-plugin</artifactId>
          <version>2.2</version>
    </plugin>

5) create WEB-INF directory inside webapp.
	>> create the web.xml file
	>> servlet and servlet-mapping
		
		  
  <servlet>
  	<servlet-name>Spring</servlet-name>
  	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
  	<load-on-startup>1</load-on-startup>
  </servlet>
  
  <servlet-mapping>
  	<servlet-name>Spring</servlet-name>
  	<url-pattern>/*</url-pattern>
  </servlet-mapping>
  
  
  name of the xml configuration file ( spring bean xml configuration file ) must be SPRING-SERVLET.XML 
  
6) create the SPRING-SERVLET.XML and add standard namespace from spring website.
	>> add mvc annotation driven
	>> add component scan
	>> add Internal view resolver for JSP ( no need for JSTL )	
