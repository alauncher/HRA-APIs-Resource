/**
 * @api {broadcast} 发送广播1 禁用下拉栏
 * @apiGroup SystemUI
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