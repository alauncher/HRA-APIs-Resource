/**
 * @api {broadcast} 发送广播com.hra.add_whiteList 设置网络白名单
 * @apiGroup NetWork
 * @apiVersion 0.0.1
 * @apiDescription 白名单内网络可以上网，不受全局网络控制（模糊查询）
 * @apiParam {ArrayList} whiteList 白名单列表
 * @apiParamExample {Android} 请求样例：
 *	ArrayList whiteList = new ArrayList<String>();
 *	whiteList.add("www.baidu.com");
 *	whiteList.add("www.sina.com.cn");
 *	Intent i = new Intent("com.hra.add_whiteList");
 * 	i.putStringArrayListExtra("whiteList",whiteList);
 * 	sendBroadcast(i);
 * @apiSuccessExample {Android} 返回样例:
 *                None
 */