# socket

<http://stackoverflow.com/questions/7384678/how-to-create-socket-connection-in-android>

This should be just plain Java, but you never know when Android decides to restrict us...

Pure Java version: <https://github.com/cirosantilli/java-cheat/blob/043969128720d3f2040816e4d0fc0fbfcac51a0f/interactive/ServerSocketCheat.java>

We need:

    <uses-permission android:name="android.permission.INTERNET" />

<http://stackoverflow.com/questions/4074808/java-socket-ioexception-permission-denied>

Find your IP with: <http://android.stackexchange.com/questions/2984/how-can-i-see-what-ip-address-my-android-phone-has/130468#130468> and then:

    netcat <ip> 12345

and type some lines.

See the server logs with:

    adb logcat -s AndroidCheatSocket

Would be cooler to show them to screen, but lazy and less minimal.
