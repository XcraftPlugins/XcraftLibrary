package de.xcraft.INemesisI.Library.Command;

import org.bukkit.command.CommandSender;

import de.xcraft.INemesisI.Library.Manager.XcraftPluginManager;

public abstract class XcraftCommand {
	private final String command;
	private final String name;
	private final String pattern;
	private String usage;
	private String desc;
	private final String permission;

	public XcraftCommand(String command, String name, String pattern, String usage, String desc, String permission) {
		super();
		this.command = command;
		this.name = name;
		this.pattern = pattern;
		this.usage = usage;
		this.desc = desc;
		this.permission = permission;
	}

	public abstract boolean execute(XcraftPluginManager manager, CommandSender sender, String[] args);

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCommand() {
		return command;
	}

	public String getName() {
		return name;
	}

	public String getPattern() {
		return pattern;
	}

	public String getPermission() {
		return permission;
	}

}