package com.imooc.mgallery.service;

import com.imooc.mgallery.dao.PaintingDao;
import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.utils.PageModel;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;
import netscape.javascript.JSUtil;

import java.util.List;

public class PaintingService {
    private PaintingDao paintingDao = new PaintingDao();

    public PageModel pagination(int page, int rows) {
        if(rows == 0) {
            throw new RuntimeException("无效的rows参数");
        }
        return paintingDao.pagination(page,rows);
    }

    public static void main(String[] args) {
        PaintingService paintingService = new PaintingService();

        //这里要考虑到 page*row不能太超过 totoalRows
        PageModel pageModel = paintingService.pagination(1,4);
        List<Painting> paintingList = pageModel.getPageData();
        for(Painting painting:paintingList) {
            System.out.println(painting.getPname());
        }
        System.out.println(pageModel.getPageStartRow() + ":" + pageModel.getPageEndRow());
    }
}
