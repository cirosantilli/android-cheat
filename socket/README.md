# socket

This should be just plain Java, but you never know when Android decides to restrict us...

Pure Java version: <https://github.com/cirosantilli/java-cheat/blob/043969128720d3f2040816e4d0fc0fbfcac51a0f/interactive/ServerSocketCheat.java>

We need:

    <uses-permission android:name="android.permission.INTERNET" />

<http://stackoverflow.com/questions/4074808/java-socket-ioexception-permission-denied>

Find your IP with: <http://android.stackexchange.com/questions/2984/how-can-i-see-what-ip-address-my-android-phone-has/130468#130468> and then:

    netcat <IP> 12345

and type some lines.
