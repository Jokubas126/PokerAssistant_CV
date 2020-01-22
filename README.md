# PokerAssistant_CV

This is a prototype of the 3rd semester group project built using Python for Computer Vision and Android Studio in Java for displaying the processed data.

# Purpose of the project

The main focus of the project was solving a problem of inexperienced poker player not being able to focus on socializing, while playing poker and not knowing the rules or combinations of the game.

# Working principle

By using the Computer Vision techniques (listed below) we detect the cards being dealt on the table and evaluate them using  [ihendley/treys](https://github.com/ihendley/treys) library. providing users with information about the strength of their hand, what hand they have and what cards make it. This information is sent to the client using socket connection between Python (server) and Android (client) applications and is displayed on the phone.

## Computer Vision techniques used

* Color segmentation
* Edge detection
* BLOB analysis
* Template Matching
* Contour finding
* Rank filters (closing)
* Noise reduction (median and gaussian filters)

# Usage
## Setup

One phone with [IP Webcam](https://play.google.com/store/apps/details?id=com.pas.webcam&hl=en) has to be installed with a resolution made to Full HD and stabily put above the table at about 30cm distance. The table has to be with a green surface and lighting has to be dim due to sensitivity for color recognition. Another Android phone has to install the android application from this repository and both Python and Android application need to change their searched IP addresses of the IP Webcam and computer in both Python and Android applications.

## Gameplay

Server has to be started and then the pocket cards need to be inputted in the Android application. Then after confirming them, the socket connection is established and cards can be dealt on the table below the camera in with as little rotation as possible due to not working rotation functionality. After the round is finished, "next round" is clicked and server application needs to restart.
