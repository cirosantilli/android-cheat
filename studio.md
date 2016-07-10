# Studio

Official GUI IDE.

<https://en.wikipedia.org/wiki/Android_Studio>

Based on JetBrains' IntelliJ IDEA software.

Replaced Eclipse Android Development Tools (ADT).

Can preview layout XMLs under `res/layout/` as a phone view.

After download, run: `$(ANDROID_STUDIO)/studio.sh`.

## Community vs ultimate

- <https://www.jetbrains.com/idea/features/>
- <http://stackoverflow.com/questions/4843882/what-exactly-is-the-difference-between-intellij-ultimate-and-community-editions>

## Keyboard shortcuts

Ctrl + F: find. If some text is selected, find it.

Change editor tabs: Alt+Left / Right

Jump to definition:

- Ctrl + Click
- Ctrl + B

Ctrl + Click on definition: show where method or variable are used.

Go to last location: <http://stackoverflow.com/questions/7441541/keyboard-shortcut-for-jump-to-previous-view-location-in-intellij-idea>

- TODO: Ctrl-Alt-Left does not switch back files?

Find stuff

- Class: Ctrl+N
- File (directory): Ctrl+Shift+N
- Symbol: Ctrl+Shift+Alt+N

Class hierarchy: Alt + *

Jump between matching and parent curly braces: Ctrl + { /  } <http://stackoverflow.com/questions/4351081/intellij-idea-shortcut-keymap-for-matching-brace>

Matching parenthesis: <http://stackoverflow.com/questions/23406380/intellij-idea-find-matching-parenthesis-bracket>

Hide currently selected pane: Shift + Esc, e.g. Project.

Alt + number: toggle open a pane. E.g.: Alt + 1 opens Project. Change them: <http://stackoverflow.com/questions/21451547/set-shortcut-number-to-intellijs-tool-windows>

Ctrl + Alt + S: Open settings dialog

Ctrl + F3: find word at caret. Copy pastes it into the find dialog, and you can then use F3 to move back and forward.

### Ubuntu keyboard conflicts

With some stupid Ubuntu keyboard shortcuts that do not use the super key as every system shortcut should:

- <http://askubuntu.com/questions/412046/unable-to-use-intellij-idea-keyboard-shortcuts-on-ubuntu>

## Appearance

Change color scheme: View | Quick Switch Scheme | Color scheme

## gitignore

Like any good IDE, keeps changing tons of files automatically for us. What to gitignore:

- <http://stackoverflow.com/questions/16736856/what-should-be-in-my-gitignore-for-an-android-studio-project>
- <http://stackoverflow.com/questions/26336709/android-studio-should-the-entire-idea-directory-be-in-git-ignore>
- <https://www.reddit.com/r/androiddev/comments/36gqb0/android_studio_keeps_changing_project_files/>

## NDK

Apparently some versions circa 2015 don't support it:

- <http://stackoverflow.com/questions/31979965/after-updating-android-studio-to-version-1-3-0-i-am-getting-ndk-integration-is>
- <http://stackoverflow.com/questions/28174893/android-studio-current-ndk-support-is-deprecated>
