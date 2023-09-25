# File Manager
Allows for easy and frictionless management of plugins right from Minecraft!


## Important:
Only files and folders located in same folder in the server jar, and in folders within said folder, can be accessed with this plugin!

This plugin is still in very early alpha! There will be bugs and tons of them. If you find any please report them to the [discord server](https://discord.gg/3CC6kVcdQH).


## General Info:

### Download:
The latest public version of the plugin will always be available on [Modrinth](https://modrinth.com/plugin/file-manager). Or you can join on the [discord](https://discord.gg/3CC6kVcdQH) to see if there are any snapshot builds you can mess around with!

### Commands:
- /plugin - The base command for installing or removing plugins from the server. <br>
- /file - Opens a GUI for navigating around the file system, alongside editing, creating, & deleting files.

### Currently Supports:
- Installing jar files from web links.
- Installing jar files from Modrinth.
- Will prompt to install plugin dependencies, if present.
- Deleting plugins.
- GUI file explorer.
- Editing of files.
- Creation of files & folders.
- Deleting files & folders.
- Automatically attempts to resolve unmet dependencies on start up if a plugin has unmet dependencies.
- Permissions.

### Permissions:
- fileman.plugin.ins - Able to install plugins.
- fileman.plugin.rm - Able to remove plugins.
- fileman.file.nav - Able to use the "/file" command, view files and folders, & navigate though folders.
- fileman.file.read - Able to read the content of files.
- fileman.file.edit - Able to edit the content of files.
- fileman.file.mk - Able to create new files.
- fileman.file.rm - Able to delete files.


### Future Plans:
- Bug fixes.
- Attempts at back-porting to older mc versions.
- Supporting downloading plugins from other websites.
- Chat based file manager.