import {AiJ} from "../../../ws/AiJ";
import FireKit from "../../../fire/FireKit";
import AppConfig from "../../../AppConfig";

/**
 * 游戏状态
 */
export default class MahjongGameStatusResponseHandler extends AiJ.ResponseHandler {

    constructor() {
        super();
    }

    handler(aiJWs: AiJ.AiJWs, response: AiJ.Response) {
        FireKit.use(AppConfig.GAME_FIRE).fire("game_status", response);
    }

}
