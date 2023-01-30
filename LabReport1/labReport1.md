# Lab Report 1

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

- `pwd` - Prints the current working directory
- `cd` - Changes the directory to a new path or directory
- `cd ..` - Changes the directory to the parent folder of the current directory
- `ls` - Lists the current directory's contents
- `ls -lat` - Lists the current directory's contents with more information like the the last time it was opened and its size 
- `ls -a` - Lists the current directory's content including hidden content starting with `.`

If you try some of these commands you will get an output similar to:
![Image][5]
These commands were run right after connecting to the server
1. `pwd` - This printed the current directory being `/home/linux/ieng6/cs15lwi23/cs15lwi23anu`
2. `ls` - This listed the files in the current directory. The the directory were two folders named `perl5` and `wavlet`
3. `ls -a` - This listed all files including hidden files in the directory as well as the the same folders seen when running just `ls`
4. `ls -lat` - This listed all the same files as `la -a` but with more information such as the last time they were opened and their size
5. `cd perl5` - This command changed the directory to be inside the `perl5` folder
6. `pwd` - This prints out the current directory showing that the working directory is now in the `perl5` folder
7. `ls` - This prints out the files in the `perl5` folder showing that the folder is empty
8. `ls -a` - This prints out all files in the `perl5` folder including hidden files
9. `cd ..` - This changes the directory to the parent directory
10. `pwd` - This prints out the current directory showing that the directory is not in the `perl5` folder


Then you can use `exit` to log out of the remote server.

[1]: https://code.visualstudio.com/
[2]: https://gitforwindows.org/

[3]: vsCodeScreenshot.png
[4]: cse15lLab1Report1.png
[5]: cse15lLab1Report4.png
[6]: cse15lLab1Report3.png