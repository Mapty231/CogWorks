package me.tye.cogworks.util.customObjects.dataClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static me.tye.cogworks.util.customObjects.dataClasses.PluginData.read;

public class DependencyInfo {

private final String name;
private final String version;

private boolean attemptADR = true;

/**
 Stores information about the dependencies of a plugin.
 @param name    The name of the plugin.
 @param version The version of the plugin. */
public DependencyInfo(String name, String version) {
  this.name = name;
  this.version = version;
}

/**
 @return The plugin name of the dependency. */
public String getName() {
  return name;
}

/**
 @return The plugin version of the dependency. */
public String getVersion() {
  return version;
}

/**
 @return True if ADR should be attempted for this dependency. Or false if it shouldn't */
public boolean attemptADR() {
  return attemptADR;
}

/**
 @param attemptADR True to attempted ADR, or false to not attempt ADR. */
public void setAttemptADR(boolean attemptADR) {
  this.attemptADR = attemptADR;
}

/**
 @return A list of plugins that have this dependency.
 @throws IOException If there was an error getting possible plugins. */
public List<PluginData> getUsers() throws IOException {
  ArrayList<PluginData> users = new ArrayList<>();
  ArrayList<PluginData> plugins = read();

  pluginLoop:
  for (PluginData plugin : plugins) {
    for (DependencyInfo dependency : plugin.getDependencies()) {
      if (!dependency.getName().equals(getName())) {
        continue pluginLoop;
      }

      users.add(plugin);
    }
  }

  return users;
}

@Override
public String toString() {
  return "Name: \""+name+"\". Version: \""+version+"\". Attempt ADR: "+attemptADR+".";
}
}
