# XML Layout

TODO: get working. App raises exception on device:

    E/AndroidRuntime(32547): FATAL EXCEPTION: main
    E/AndroidRuntime(32547): Process: com.cirosantilli.android_cheat.xml_layout, PID: 32547
    E/AndroidRuntime(32547): java.lang.RuntimeException: Unable to start activity ComponentInfo{com.cirosantilli.android_cheat.xml_layout/com.cirosantilli.android_cheat.xml_layout.Main}: android.view.InflateException: Binary XML file line #2: Error inflating class android.support.design.widget.CoordinatorLayout
    E/AndroidRuntime(32547): 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2379)
    E/AndroidRuntime(32547): 	at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:2442)
    E/AndroidRuntime(32547): 	at android.app.ActivityThread.access$800(ActivityThread.java:156)
    E/AndroidRuntime(32547): 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1351)
    E/AndroidRuntime(32547): 	at android.os.Handler.dispatchMessage(Handler.java:102)
    E/AndroidRuntime(32547): 	at android.os.Looper.loop(Looper.java:211)
    E/AndroidRuntime(32547): 	at android.app.ActivityThread.main(ActivityThread.java:5373)
    E/AndroidRuntime(32547): 	at java.lang.reflect.Method.invoke(Native Method)
    E/AndroidRuntime(32547): 	at java.lang.reflect.Method.invoke(Method.java:372)
    E/AndroidRuntime(32547): 	at com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1020)
    E/AndroidRuntime(32547): 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:815)
    E/AndroidRuntime(32547): Caused by: android.view.InflateException: Binary XML file line #2: Error inflating class android.support.design.widget.CoordinatorLayout
    E/AndroidRuntime(32547): 	at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:757)
    E/AndroidRuntime(32547): 	at android.view.LayoutInflater.inflate(LayoutInflater.java:482)
    E/AndroidRuntime(32547): 	at android.view.LayoutInflater.inflate(LayoutInflater.java:414)
    E/AndroidRuntime(32547): 	at android.view.LayoutInflater.inflate(LayoutInflater.java:365)
    E/AndroidRuntime(32547): 	at com.android.internal.policy.impl.PhoneWindow.setContentView(PhoneWindow.java:382)
    E/AndroidRuntime(32547): 	at android.app.Activity.setContentView(Activity.java:2145)
    E/AndroidRuntime(32547): 	at com.cirosantilli.android_cheat.xml_layout.Main.onCreate(Main.java:10)
    E/AndroidRuntime(32547): 	at android.app.Activity.performCreate(Activity.java:5990)
    E/AndroidRuntime(32547): 	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1106)
    E/AndroidRuntime(32547): 	at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2332)
    E/AndroidRuntime(32547): 	... 10 more
    E/AndroidRuntime(32547): Caused by: java.lang.ClassNotFoundException: Didn't find class "android.support.design.widget.CoordinatorLayout" on path: DexPathList[[zip file "/data/app/com.cirosantilli.android_cheat.xml_layout-1/base.apk"],nativeLibraryDirectories=[/vendor/lib, /system/lib]]
    E/AndroidRuntime(32547): 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:56)
    E/AndroidRuntime(32547): 	at java.lang.ClassLoader.loadClass(ClassLoader.java:511)
    E/AndroidRuntime(32547): 	at java.lang.ClassLoader.loadClass(ClassLoader.java:469)
    E/AndroidRuntime(32547): 	at android.view.LayoutInflater.createView(LayoutInflater.java:571)
    E/AndroidRuntime(32547): 	at android.view.LayoutInflater.createViewFromTag(LayoutInflater.java:743)
    E/AndroidRuntime(32547): 	... 19 more
    E/AndroidRuntime(32547): 	Suppressed: java.lang.ClassNotFoundException: android.support.design.widget.CoordinatorLayout
    E/AndroidRuntime(32547): 		at java.lang.Class.classForName(Native Method)
    E/AndroidRuntime(32547): 		at java.lang.BootClassLoader.findClass(ClassLoader.java:781)
    E/AndroidRuntime(32547): 		at java.lang.BootClassLoader.loadClass(ClassLoader.java:841)
    E/AndroidRuntime(32547): 		at java.lang.ClassLoader.loadClass(ClassLoader.java:504)
    E/AndroidRuntime(32547): 		... 22 more
    E/AndroidRuntime(32547): 	Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack available
    E/linker  (32522): "app_process": ignoring 2-entry DT_PREINIT_ARRAY in shared library!

Minimal example of how to use an XML layout in `res/layouts/main.xml`.

More information at: <http://developer.android.com/guide/topics/resources/layout-resource.html>

Layout resources generate `View` and other classes accessible through `R`, which can then be fed into `setContent`.

The generated classes are put under `gen/`.

It is a pain to manage layout classes manually: the XML method exists mostly because it is easier to generate that from GUI tools than to manipulate Java code. Yuck.

All of those classes can also be created manually to generate the same effect.
