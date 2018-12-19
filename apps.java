/**
 * @api {broadcast} 发送广播1 静默安装应用
 * @apiGroup APPs
 * @apiVersion 0.0.1
 * @apiDescription 静默卸载应用
 * @apiParam {String} packageName 需卸载应用的包名
 * @apiParamExample {Android} 请求样例：
 * String pkg = "com.android.camera2";
 * Intent i = new Intent("com.hra.Silence.uninstall");
 * i.putExtra("packageName",pkg);
 * sendBroadcast(i);
 * @apiSuccessExample {Android} 返回样例:
 *                None
 */
 
 /**
 * @api {broadcast} 发送广播com.hra.Silence.uninstall 静默卸载应用
 * @apiGroup APPs
 * @apiVersion 0.0.1
 * @apiDescription 静默卸载应用
 * @apiParam {String} packageName 需卸载应用的包名
 * @apiParamExample {Android} 请求样例：
 * String pkg = "com.android.camera2";
 * Intent i = new Intent("com.hra.Silence.uninstall");
 * i.putExtra("packageName",pkg);
 * sendBroadcast(i);
 * @apiSuccessExample {Android} 返回样例:
 *                None
 */
 
/**
 * @api {broadcast} 发送广播com.hra.add_whiteList 设置应用白名单
 * @apiGroup APPs
 * @apiVersion 0.0.1
 * @apiDescription 白名单内应用可以安装，否则不可安装
 * @apiParam {ArrayList} packageName 白名单包名列表
 * @apiParam {int} flag 标记位：1添加，2删除，3清空
 * @apiParamExample {Android} 请求样例：
 * ArrayList pkgList = new ArrayList<String>();
 * pkgList.add("com.android.camera2");
 * pkgList.add("com.android.settings");
 * Intent i = new Intent("com.hra.whitelist_app.update");
 * i.putStringArrayListExtra("packageName",pkgList);
 * i.putExtra("flag",1);
 * sendBroadcast(i);
 * @apiSuccessExample {Android} 返回样例:
 *                None
 */
 
 /**
 * @api {broadcast} 发送广播2 清空应用安装白名单
 * @apiGroup APPs
 * @apiVersion 0.0.1
 * @apiDescription 白名单内应用可以安装，否则不可安装
 * @apiParam {ArrayList} packageName 白名单包名列表
 * @apiParam {int} flag 标记位：1添加，2删除，3清空
 * @apiParamExample {Android} 请求样例：
 * ArrayList pkgList = new ArrayList<String>();
 * pkgList.add("com.android.camera2");
 * pkgList.add("com.android.settings");
 * Intent i = new Intent("com.hra.whitelist_app.update");
 * i.putStringArrayListExtra("packageName",pkgList);
 * i.putExtra("flag",1);
 * sendBroadcast(i);
 * @apiSuccessExample {Android} 返回样例:
 *                None
 */