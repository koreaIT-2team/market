package team2mall.demo.service.admin;

import team2mall.demo.dto.CategoryResponseDto;
import team2mall.demo.dto.ProductRegisterReqDto;
import team2mall.demo.dto.admin.ProductImgReqDto;
import team2mall.demo.dto.admin.ProductMstOptionRespDto;
import team2mall.demo.dto.admin.ProductRegisterDtlReqDto;

import java.util.List;

public interface ProductManagementService {

    public List<CategoryResponseDto> getCategoryList() throws Exception;

    public void registerMst(ProductRegisterReqDto productRegisterReqDto) throws Exception;

    public List<ProductMstOptionRespDto> getProductMstList() throws Exception;

    public List<?> getSizeList(int productId) throws Exception;

    public void checkDuplicatedColor(ProductRegisterDtlReqDto productRegisterDtlReqDto) throws Exception;

    public void registerDtl(ProductRegisterDtlReqDto productRegisterDtlReqDto) throws Exception;

    public void registerImg(ProductImgReqDto productImgReqDto) throws Exception;
}
