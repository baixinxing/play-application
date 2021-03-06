package com.qq.weixin.mp.model.msg.receive;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * 用户关注，取消关注,扫描带参数二维码事件,
 * <p>
 * <code>
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[FromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime>
 * <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[subscribe]]></Event>
 * </xml>
 * </code> <code>
 * <xml><ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[FromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime>
 * <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[subscribe]]></Event>
 * <AdminEventKey><![CDATA[qrscene_123123]]></AdminEventKey>
 * <Ticket><![CDATA[TICKET]]></Ticket>
 * </xml>
 * </code>
 * <p>
 * <code>
 * <xml>
 * <ToUserName><![CDATA[toUser]]></ToUserName>
 * <FromUserName><![CDATA[FromUser]]></FromUserName>
 * <CreateTime>123456789</CreateTime>
 * <MsgType><![CDATA[event]]></MsgType>
 * <Event><![CDATA[SCAN]]></Event>
 * <AdminEventKey><![CDATA[SCENE_VALUE]]></AdminEventKey>
 * <Ticket><![CDATA[TICKET]]></Ticket>
 * </xml>
 * </code>
 *
 * @author lig
 */
@Root(name = "xml")
public class WexinMsgEventSubscribe extends WexinMsgFactory.WechatMsgParent {
    @Element(name = "AdminEventKey", required = false)
    private String eventKey;
    @Element(name = "Ticket", required = false)
    private String ticket;

}
