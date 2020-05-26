# ZoomNotifier
Notifies users through email when a minimum number of participants have joined your meeting.

Under construction--> 
- checking for multiple audio recordings need to be fixed
- receiving email notifications instead of console message

# Why?
During the pandemic I had to conduct tutoring sessions for students online. Students would come in any time between a 3 hour period and I would wait until they came. The problem though was I would want to go and do other things instead of waiting for students to show up. 

Zoom offers the feature to email you when someone is waiting to join but if the meeting is already started you are expected to watch or hear the chime on your computer. To fix my problem of waiting for students I created this program.

After you run it, every 15 seconds it will check to see if anyone joined and then email you if a new person joined.

Additional Features:
    -Notifies you when a certain number of attendants have joined
    
    
# How to use
1) Enable record with multiple audios in Zoom
--> go to Preferences --> Recording --> record a seperate audio file for each participant
2) Create a folder called "notify" inside /Users/yourUser/Documents/Zoom
3) Delete all previous recordings in Users/yourUser/Documents/Zoom/notify
4) Change your Zoom recording storage to Users/yourUser/Documents/Zoom/notify
5) Start Meeting 
6) Click Record
