package com.ssafy.api.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ApiModel("FavReq")
public class FavReq {
    @ApiModelProperty(name = "nickname", example = "GodHanQ")
    String nickname;
}
