README

This is a test javaFXPorts build, it works in android.


Steps 

-Set up two gradle project, one root and other one inside that root(subproject)
-Set up the subproject build.gradle configuration
-Set up androidManifest.xml configuration
-Download Android sdk21
-Set up JAVA_HOME or set the path in build.gradle
-Go to the root project folder and run gradlew *
	-"gradlew android" generate the apk in the subproject-->build-->javafxports-->android
	https://stackoverflow.com/questions/36254870/how-to-make-a-singed-apk-file-with-javafxports
	-"gradlew androidinstall" generate and installs the apk to connected device

usefull links

https://www.youtube.com/watch?v=syTDPTViCKM
http://docs.gluonhq.com/javafxports/ *more gradlew commands here
http://gluonhq.com/products/mobile/javafxports/get/



------iOS
To create the .ipa you need specific MAC tools, idk if you can create in windows
https://stackoverflow.com/questions/41524881/gluon-ios-java-io-ioexception-cannot-run-program-security-createprocess-err

You can use gradlew createIpa to create the iOS app


-----Common errors

-Black screen app in android
	Probably you have bad main configuration of manifest(the main class)
-Cannot run program "security" building .IPA.
	Try building on a mac, you need some mac tools.
	
	
I hope it helps. 

Have a nice day.

