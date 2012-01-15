Lift OpenID Example
===================
This project is based on the lift-archetype-basic maven archetype using
 
* sbt 0.11.1
* scala 2.9.1
* lift 2.4-M5

Run the project by starting sbt in the web/ directory and entering:

	~container:start 

The application can be viewed at <a href="http://localhost:8080">http://localhost:8080</a>


Basic Lift OpenID integration
-----------------------------
Basic Lift OpenID integration follows the steps lined on <a href="http://www.assembla.com/spaces/liftweb/wiki/OpenID">Assembla OpenID instructions</a>

openid-selector Javascript integration
-----------------------------
<a href="http://code.google.com/p/openid-selector/">openid-selector</a> provides a Javascript OpenID selector which allows users to select an OpenID provider by clicking a recognisable logo rather than entering an OpenID provider URL.

Integration with Lift is handled in the webapp/template_hidden/login.html file, wrapped by the login_template.html surround.

These templates are written for HTML5 so make sure you have this set in your Boot.scala:

	LiftRules.htmlProperties.default.set((r: Req) =>new Html5Properties(r.userAgent))

