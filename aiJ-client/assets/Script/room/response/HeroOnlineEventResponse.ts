import {AiJ} from "../../ws/AiJ";

/**
 * 离线事件
 */
export default class HeroOnlineEventResponse extends AiJ.Response {
    /**
     * 椅子
     */
    chair: number;
    /**
     * 用户ID
     */
    userId: string;
    /**
     * 用户名
     */
    userName: string;
}
