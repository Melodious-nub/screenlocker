# ScreenLocker 🔒

A lightweight, privacy-focused, one-click screen locking solution for Android.

[![Android Version](https://img.shields.io/badge/Android-9.0%2B-brightgreen.svg)](https://developer.android.com)
[![Privacy](https://img.shields.io/badge/Privacy-No%20Data%20Collected-blue.svg)](#privacy--security)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

## 🌟 Overview

**ScreenLocker** is a simple yet powerful utility designed to do exactly one thing: lock your screen instantly with a single tap. It is a **100% Native Android** application built using Kotlin.

While many similar apps exist, ScreenLocker was built with a **"Security First"** philosophy. It requires zero internet access, collects zero data, and uses modern Android APIs to ensure maximum compatibility without triggering security flags in sensitive applications like banking apps.

---

## 📖 The Story Behind ScreenLocker

The inspiration for this app came from a personal frustration. As a **Pixel 7** user, I encountered a common issue: a failing physical power button. While the Pixel has a "Double Tap to Wake" gesture, it lacks a native gesture or simple shortcut to **lock** the screen.

I tried existing "Screen Lock" apps from the Play Store, but I found two major issues:
1. **Privacy Risks:** Many apps requested unnecessary permissions (like Internet or Location) or were bloated with ads.
2. **Device Admin Hassles:** Older apps use "Device Administrator" privileges, which make them difficult to uninstall and often cause banking apps to flag the device as "high risk."

So, I built ScreenLocker to be the tool I wanted for myself: **Open Source, Offline, and Invisible.**

---

## ✨ Key Features

- **🚀 One-Tap Lock:** Just click the icon, and your screen is locked. No UI, no waiting.
- **🛡️ Bank App Friendly:** Unlike apps using "Device Admin," ScreenLocker uses the modern Accessibility API. This means most banking apps won't block it or warn you about "untrusted third-party tools."
- **🌐 100% Offline:** The app has **zero** internet permissions. Your data never leaves your device because the app literally cannot talk to the internet.
- **🪶 Ultra Lightweight:** No external libraries, no bloat. The APK size is minimal, and it consumes virtually zero battery.
- **🔒 Privacy by Design:** The Accessibility Service configuration explicitly disables `canRetrieveWindowContent`, meaning the app **cannot** see what is on your screen or what you type.

---

## 🛠️ Technical Details & Compatibility

- **Minimum Version:** Android 9.0 (API 28)
- **Target Version:** Android 15 (API 35)
- **Language:** Kotlin (100% Native)
- **Implementation:** Uses `AccessibilityService.GLOBAL_ACTION_LOCK_SCREEN`.
- **Build Automation:** APKs are automatically renamed to `ScreenLocker_v[version].apk` during build.
- **Security:** 
    - No `INTERNET` permission.
    - No `READ_EXTERNAL_STORAGE` permission.
    - No `canRetrieveWindowContent` flag (the app is "blind" to your screen content).

---

## 🚀 How to Use

1. **Install** the APK.
2. **Open** the app for the first time. It will automatically redirect you to the **Accessibility Settings**.
3. Find **ScreenLocker** in the list and **Enable** it.
4. (Optional) Drag the ScreenLocker icon to your home screen or dock for easy access.
5. **Tap and Lock!**

> [!TIP]
> *Some very strict banking apps might still require you to temporarily toggle off Accessibility Services if they detect any active service. However, for 99% of use cases, ScreenLocker remains completely "stealthy."*

---

## 🛡️ Privacy & Security

This app is designed to be the safest tool on your phone.
- **Data Collection:** None.
- **Permissions:** Only requires the Accessibility Service to perform the "Lock" action.
- **Ads/Tracking:** None.

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## 👨‍💻 Developer

**Shawon Talukder**  
Software Engineer at Green Delta Insurance PLC  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-blue?style=flat&logo=linkedin)](https://www.linkedin.com/in/shawon-taluckder)

---

*Developed with ❤️ for the Android community.*
