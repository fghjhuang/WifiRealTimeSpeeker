# WifiRealTimeSpeeker

以后会把改功能库移植到LiteRTS实时对讲库中，
LiteRTS库以后会提供android和ios双平台的实时对讲支持，
而且支持局域网内通话，同时也可以搭载服务器实现远程实时通话，
目前在努力完成中，已经完成opus-android端的对讲代码，正在研究ios和android互通中
项目地址：<https://github.com/fghjhuang/LiteRTS>

* 更新LiteRTS，udp对讲项目，使用opus压缩音频，udp发送，基本功能完成，可以实现局域网内对讲，实时流量稍微比微信实时对讲大一点
### 接下来的任务
* 重构udp对讲部分，opus压缩库，udp发送部分，对讲ui库
* opensl 采集音频
* 音频处理库，尝试使用speex，opus，webrtc做处理
* 协议发送，尝试使用rtmp发送，udp发送
