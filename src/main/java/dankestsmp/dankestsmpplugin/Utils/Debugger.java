package dankestsmp.dankestsmpplugin.Utils;

import dankestsmp.dankestsmpplugin.DankestSMPPlugin;

//This class is to send important messages to console about what the plugin is currently doing
public final class Debugger {

    boolean debuggerOn = true;

    public void sendMessageToConsole(String message){
        if(debuggerOn){
            DankestSMPPlugin.plugin.getLogger().info("[Debugger] " + message);
        }
    }

    public boolean isDebuggerOn(){
        return debuggerOn;
    }

    public void toggleDebugger(){
        debuggerOn = !debuggerOn;
    }

}
