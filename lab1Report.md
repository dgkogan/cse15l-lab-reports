# Lab 1 Report

## 1. Installing VS Code

To install VS Code, go to [the VS code website][1] and follow their 
instructions for your particular system. Just run the installer and follow its directions.

Once it is installed, it should look like: ![Image][3]

## 2. Remotely Connecting

First, make sure you have your account set up with your username and password. 

If you are on a Windows machine, you will also have to install Git from the [Git website][2].

Now, you should be able to use the `git bash` terminal 

In the new terminal, we can `ssh` into our account using the command:
```
ssh cs15lwi23zzz@ieng6.ucsd.edu
```
where zzz is replaced by your unique 3 letters
from your account.

If it's your first time using this command to log
into your account, you will get a message like:
```
The authenticity of host 'ieng6.ucsd.edu (128.54.70.227)' can't be established.
RSA key fingerprint is SHA256:zzzzzzz+zzzzzzzzzzzzzzzzzzzzzzz/zzzzzzzzzzz.
Are you sure you want to continue connecting (yes/no/[fingerprint])? 
```

If it's your first time getting this message, respond with yes as it will allow you to log in.

Then you will be prompted to input your password. You won't be able to see your password as you are typing it, but trust that it is reading your key presses. 

Once you are logged in, your terminal should look like:
![Image][4]

## 3. Trying Some Commands

How that you have access to this remote computer, try to run some commands. Some commands you can try are:

- `pwd`
- `cd`
- `cd ~`
- `ls`
- `ls -lat`
- `ls -a`

If you try some of these commands you will get an output similar to:
![Image][5]
![Image][6]

Then you can use `exit` to log out of the remote server.

[1]: https://code.visualstudio.com/
[2]: https://gitforwindows.org/

[3]: vsCodeScreenshot.png
[4]: cse15lLab1Report1.png
[5]: cse15lLab1Report2.png
[6]: cse15lLab1Report3.png