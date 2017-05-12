Android-java-appium
==================

## Installation

Download&Install:
- IntelliJ community edition
- Android studio
- Appium (appium-desktop-Setup-1.0.0.exe)
- Node js
- git (https://git-scm.com)
- java jdk (not jre)

## Setup

- Start up IntelliJ (do you know for sure you have git installed?)
- Choose Check out from Version Control -> Git
- Fill in URL "https://github.com/dlammerse/NSAndroid.git"
- press Test
- press Clone<br /><br />
- in IntelliJ
  - open project structure (CTRL + Shift + Alt + S)
  - modules tab
  - select JDK and direct to you java/jdk folder<br /><br />
- install plugins: gherkin, cucumber


## Appium setup
- in Adanced tab check 'Allow Seesion Override'
- click Start Server<br /><br />
- Click start new session and fill in:
  - automationName :text: Appium
  - platformName :text:  Android
  - app :text: \<your user dir>\NS Reisplanner Xtra_v4.6.16_apkpure.com.apk
  - deviceName :text: Android Emulator
  - platformVersion :text: 5.1 (fill in the version that matches your emulator)
  - appWaitActivity :text: nl.ns.android.activity.welcome.WelcomActivity
  
 ## Android Studio
 - click on AVD manager in menu bar
 - click Create Virtual Device
 - Select an device (for example Nexus 5X) and click Next
 - Select Lollipop (API 22), if not available find it in the other tabs.
 - Click Next and Finish<br /><br />
 - Click Tools->Android->SDK Manager in Android studio main menu
 - Choose tab SDK tools
 - Make sure Android SDK Platform-Tools are installed
  
## Further setup
 - Add ANDROID_HOME to your system variables with value C:\Users\\\<username>\\AppData\Local\Android\Sdk
 - Open command prompt and run: `npm install -g appium`



