## This repository was created for projects related to Image Processing with ImageJ. Specifically, below are descriptions of how to create, run, and delete plugins.

## <b>Tools:</b>
### - Eclipse IDE
- version: 2022-09 (4.25.0)
- build id: 20220908-1902
### - OS (Linux): Pop!_OS 20.04 LTS 64-bit


#

## <b>Starting</b>

### 1 - Use this template and create a new repository. Then clone the repository inside eclipse-workspace.

### 2 - In Eclipse, click File > Import. The following window will open. Under General, select Projects from Folder or Archive. Click Next.
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078791845963903006/image.png" />

### 3 - Click Directory and find the folder containing IJ, Plugins_ and the tools.jar file.
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078792972709142548/image.png"/>

### 4 - Select IJ.
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078800062542516295/image.png"/>

### 5 - On this screen, click Finish. Repeat the process for the Plugins_ folder.
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078800463048220732/image.png" />

### 6 - You will most likely get an error regarding the IJ folder. We will need to config the build path.
![image](https://user-images.githubusercontent.com/39139480/221313032-75bdaa3f-cd09-4ef9-83c3-1f48d29883d7.png)

### 7 - From the options on the left, select Java Build Path. Select the Libraries tab and then select tools.jar and remove it.
![image](https://user-images.githubusercontent.com/39139480/221314017-2c566c8c-ff6d-4f03-981d-3ecdf5aabdcc.png)

### 8 - Click Add External JARs and select the tools.jar file which is in the same folder as IJ and Plugins_. Then click Apply and Apply and Close.
![image](https://user-images.githubusercontent.com/39139480/221315475-d8579b59-6abc-4129-b8c5-6f684c63eeb8.png)

#

## <b>Create a plugin</b>

### <b>1 - In the default package folder, create a new class. Remember that a plugin's class name must end with an underscore (example: myClass_).</b>
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078771639971500113/image.png" />

#

### <b>2 - Implement the interface and write your code. Here, when running the plugin, it will show a log with the message "Inside Example_".</b>
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078774076119719966/image.png" />

#

### <b>3 - In the debug options, click the down arrow and select debug_config. This will launch the ImageJ application.</b>
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078779172161339463/image.png" />

#

### <b>4 - In the application, in Plugins options, it is possible to see the new plugin. When clicking on it, the code that was placed inside the run method will be executed.</b>
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078777689856557136/image.png" />

#

### <b>5 - Below, the plugin running.</b>
<img src="https://cdn.discordapp.com/attachments/794976752836673536/1078778883375108156/image.png" />

#

## <b>Delete a plugin</b>

### <b>Before starting, make sure ImageJ is not running.</b>

### 1 - In the Package Explorer, click on a file and update the repository by pressing F5. This is needed to show possible files that were created but are not being shown.

### 2 - If you delete only the plugin (inside the default package folder), when running ImageJ it will still appear in the list and can be run normally.

### 3 - To actually delete, you need to delete the following files:
- IJ/plugins/Plugins_.jar
- Plugins_/Plugins_.jar

### 4 - So, again, in the debug options, click the down arrow and select debug_config. This will build a new .jar with the remaining plugins.

## <b>Other Materials</b>
https://www.youtube.com/watch?v=toe19WETRt4&ab_channel=DaviCarvalho
