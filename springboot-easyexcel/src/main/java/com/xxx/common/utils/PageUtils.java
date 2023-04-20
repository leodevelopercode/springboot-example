package com.xxx.common.utils;

import com.github.pagehelper.PageHelper;
import com.xxx.common.core.page.PageDomain;
import com.xxx.common.core.page.TableSupport;
import com.xxx.common.utils.sql.SqlUtil;

/**
 * 分页工具类
 * @author Xiexingxie
 * @date 2023/3/2 下午 09:46
 */
public class PageUtils  extends PageHelper {

    /**
     * 设置请求分页数据
     */
    public static void startPage()
    {
        PageDomain pageDomain = TableSupport.buildPageRequest();
        Integer pageNum = pageDomain.getPageNum();
        Integer pageSize = pageDomain.getPageSize();
        String orderBy = SqlUtil.escapeOrderBySql(pageDomain.getOrderBy());
        Boolean reasonable = pageDomain.getReasonable();
        PageHelper.startPage(pageNum, pageSize, orderBy).setReasonable(reasonable);
    }

    /**
     * 清理分页的线程变量
     */
    public static void clearPage()
    {
        PageHelper.clearPage();
    }
    
}
