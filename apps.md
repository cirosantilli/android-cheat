# Apps

TODO: how to add Skype number to a contact?

## Google search app

Change URL handlers:

- <http://android.stackexchange.com/questions/83319/how-to-disable-redirects-from-google-search-results-to-android-apps>
- <http://android.stackexchange.com/questions/139489/how-to-disable-redirects-from-google-search-results-to-android-apps-different-i>

Wikipedia has shows the option to open on the browser, but e.g. the Stack Exchange app *always* takes over!!!

## Chrome

### Full screen

Hides the address bar. Impossible to leave?

<http://stackoverflow.com/questions/28647604/force-hide-address-bar-in-chrome-on-android>
<http://android.stackexchange.com/questions/63324/how-to-exit-fullscreen-in-android-chrome>

## Default apps for each type of file

TODO how to set it??

Lollipop: go under Settings > Apps, and remove the app as default: https://www.androidpit.com/how-to-change-android-default-apps

First you must find which app it is by opening some file with it.

## Energy consumption of apps

TODO: how to find energy hogs?

GPS settings do show the energy consumption for each GPS using app. TODO: how is it calculated? <http://stackoverflow.com/questions/20012518/recent-location-requests-high-battery-use>

## Block number

- http://talk.sonymobile.com/t5/Xperia-Z1-Z1s/How-to-block-someones-call-and-sms-on-ma-xperia-z1/m-p/799031#M32118
- http://android.stackexchange.com/questions/80806/how-to-block-a-number-in-sony-xperia-j

## Camera

Sony Xperia stores camera pictures under `/sdcard/DSIM/100ANDRO`>

<https://en.wikipedia.org/wiki/Data_center_infrastructure_management>

### Google photos

Share all photos: <https://www.reddit.com/r/google/comments/3dqx07/google_photos_share_entire_library/>

## Play Music

Google default music player.

TODO: how to find music path in phone?

## Keyboard

How to change keyboard autocomplete language?

Per-app keyboard: apparently not possibly by default:

- <http://gs5.wonderhowto.com/how-to/automatically-change-keyboards-for-specific-apps-android-0160081/>
- <http://androidforums.com/threads/keyboard-per-app.860155/>

### Unicode input

<http://android.stackexchange.com/questions/17994/how-can-i-type-special-symbols-on-my-android-device-like-or-as-a-regular-cha>

This currently looks like the only Unicode keyboard out there, but it is paid! <https://play.google.com/store/apps/details?id=uk.co.cwd.unicodekeyboard>

### Google Keyboard

Voice recognition button is there, but does nothing! Android 5.1.1, latest Google keyboard: <https://productforums.google.com/forum/#!topic/nexus/SGacqxsz09I> The top answer there worked!

## Google search bar does not fit anymore on the top of the home screen

Settings -> Apps -> All -> Xperia Home -> Clear data -> OK.

## WhatsApp

Emoji: button to the left of text box!

Web interface: https://web.whatsapp.com/ App menu does not have the button for me: <http://android.stackexchange.com/questions/96531/how-to-scan-qr-code-for-whatsapp-web#comment162747_96547>

Double ticks: <https://www.quora.com/Do-double-grey-ticks-on-the-WhatsApp-mean-the-person-is-online>

- 1 gray tick: sent to server
- 2 gray ticks: sent to recipient's phone
- 2 blue ticks: recipient read the message

## Facebook messenger

Why it exists in addition to WhatsApp: <http://thenextweb.com/facebook/2014/04/10/facebooks-two-pronged-mobile-messaging-app-strategy/>

Meh, they just bought off the competition.

### Facebook chat heads

<http://stackoverflow.com/questions/15975988/what-apis-in-android-is-facebook-using-to-create-chat-heads>

## Contacts

TODO? Call with custom app: E.g. Skype. Only works for WhatsApp out of the box...

### Per contact ringtone

Yes, from the magic Contacts app!

Select a contact, hit the menu item then set ringtone.

## Wallpaper

## Ringtone

Remove gap: <http://android.stackexchange.com/questions/24466/how-do-i-remove-delay-between-ringtones>

Psychoacoustics: best type:

- <http://www.everydaylistening.com/articles/2011/5/29/the-definition-of-a-good-ringtone.html>
- <http://gizmodo.com/5983194/whats-the-best-ringtone-youve-ever-heard>

My take:

- high pitch is more audible
- more continuous sound is better
- not longer than 4 seconds so you know it is a ringtone, how many times it sounded, and not regular music
- does not start too abruptly so as to not jump scare you

Good song starts:

- qu yuan lisao
- return to forever medieval ouverture

### Ringtone location

- http://android.stackexchange.com/questions/56905/where-is-the-default-ringtone-stored
- http://android.stackexchange.com/questions/123802/location-for-custom-ringtones-alarms-notifications-that-hides-them-from-play-mus
- http://android.stackexchange.com/questions/28300/how-to-manually-upload-ringtones-and-notifications-to-droidx

Best place seems:

    /system/media/audio/ringtones

`ogg` and `mp3` both worked fine.

### Media scan

Songs don't show by default after you copy them manually there: <http://android.stackexchange.com/questions/56905/where-is-the-default-ringtone-stored/56908?noredirect=1#comment162980_56908>

You need to trigger the media scan.

One way to do that is to reboot.

From the CLI without rebooting: <http://android.stackexchange.com/questions/51784/can-i-trigger-a-media-scan-via-the-the-command-line>

There's an app for that: <https://play.google.com/store/apps/details?id=com.addz.mediascanner>

## Native development

Dev android apps inside Android!

<https://play.google.com/store/apps/details?id=com.aide.ui&feature=search_result>

## Email

Gmail is the most stock we can get in Android 5.

<http://www.techrepublic.com/article/lollipop-kills-stock-email-app-in-favor-of-gmail/>

<http://arstechnica.com/gadgets/2014/06/google-puts-androids-stock-e-mail-app-in-the-play-store/>

## Photos

## Google Photos

- Photo descriptions before they are uploaded: <https://productforums.google.com/forum/#!topic/photos/2LxXxgKu3GE;context-place=forum/photos>
- albums before upload: <https://productforums.google.com/forum/#!topicsearchin/photos/author$3Ame$20is$3Afirstpost>
- Don't block the UI after "Back up now": allow me to continue browsing other photos <https://productforums.google.com/forum/#!topic/photos/Gy-DuJkCf5o>
