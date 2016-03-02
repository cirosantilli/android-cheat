# Handler

I think this runs on the Main UI thread: e.g. if we try to open a socket from it, we get `NetworkOnMainThreadException` <http://stackoverflow.com/questions/6343166/android-os-networkonmainthreadexception>
