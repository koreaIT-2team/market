package team2mall.demo.dto.admin;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Data
public class ProductImgReqDto {
    private int pdtId;
    private List<MultipartFile> files;
}
