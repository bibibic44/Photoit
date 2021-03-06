/* 2021-07-27 스켈레톤 코드 작성	by.HeeJung,Lee */

package com.ssafy.api.response;

import com.ssafy.common.model.response.BaseResponseBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 스튜디오 수정페이지 베스트3사진 받아오기 API ([GET] /studioedit/bestphoto) 요청에 필요한 리스폰스 바디 정의.
 */
@Getter
@Setter
@ApiModel("BaseResponseBody")
public class StudioEditPhotoResponseBody extends BaseResponseBody {
	@ApiModelProperty(name="사진 ID 배열", example = "123512")
	List<String> id;
	@ApiModelProperty(name="사진 파일", example = "multipart 형")
	List<String> files;
	
	public static StudioEditPhotoResponseBody of(Integer statusCode, String message, List<String> id, List<String> files) {
		StudioEditPhotoResponseBody body = new StudioEditPhotoResponseBody();
		body.setStatusCode(statusCode);
		body.setMessage(message);
		body.setId(id);
		body.setFiles(files);
		return body;
	}

	@Override
	public String toString() {
		return "StudioEditPhotoResponseBody{" +
				"id=" + id +
				", files=" + files +
				'}';
	}
}
