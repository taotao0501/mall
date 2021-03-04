package com.imooc.mgallery.dao;

import com.imooc.mgallery.entity.Painting;
import com.imooc.mgallery.utils.PageModel;
import com.imooc.mgallery.utils.XmlDataSource;

import java.util.List;

public class PaintingDao {
    /**
     *
     * @param page
     * @param rows
     * @return
     */
    public PageModel pagination(int page, int rows) {
        List<Painting> list = XmlDataSource.getRawData();
        PageModel pageModel = new PageModel(list,page,rows);
        return pageModel;

    }

}
