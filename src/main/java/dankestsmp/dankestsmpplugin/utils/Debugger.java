package dankestsmp.dankestsmpplugin.utils;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;

//This class is to send important messages to console about what the plugin is currently doing
public final class Debugger {

    public static boolean debuggerOn = true;

    public static void sendMessageToConsole(String message){
        if(debuggerOn){
            DankestSMPPlugin.plugin.getLogger().info("[Debugger] " + message);
        }
    }

    public static boolean isDebuggerOn(){
        return debuggerOn;
    }

    public static void toggleDebugger(){
        debuggerOn = !debuggerOn;
    }

}
