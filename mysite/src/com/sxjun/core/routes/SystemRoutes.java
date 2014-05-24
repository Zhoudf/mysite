package com.sxjun.core.routes;

import com.jfinal.config.Routes;
import com.sxjun.site.common.Global;
import com.sxjun.system.controller.LoginController;
import com.sxjun.system.controller.MenuController;

public class SystemRoutes extends Routes {
	public void config() {
		add("/", LoginController.class);
		add("/login", LoginController.class);
		add(Global.adminPath+"/menu", MenuController.class,"system/menu");
	}
}
