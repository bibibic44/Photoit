/* 작성자 : 김지현 */

package com.ssafy.api.response;

import com.ssafy.common.model.response.BaseResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Arrays;

@Getter
@Setter
@ApiModel("StudioEditCalendarResBody")
public class StudioCalendarResBody extends BaseResponseBody {
    @ApiModelProperty(name="일정 리스트", example = "210801")
    String[] calList;

    public static StudioCalendarResBody of(Integer statusCode, String message, String[] calList) {
        StudioCalendarResBody body = new StudioCalendarResBody();
        body.setStatusCode(statusCode);
        body.setMessage(message);
        body.setCalList(calList);
        return body;
    }

    @Override
    public String toString() {
        return "StudioCalendarResBody{" +
                "calList=" + Arrays.toString(calList) +
                '}';
    }
}
