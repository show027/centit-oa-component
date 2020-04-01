package com.centit.product.oa.service;

import com.centit.product.oa.po.BbsPiece;
import com.centit.product.oa.po.BbsSubject;
import com.centit.product.oa.po.InnerMsg;
import com.centit.support.database.utils.PageDesc;

import java.util.List;
import java.util.Map;

public interface BbsManager {
    List<BbsSubject> listBbsSubjects(Map<String, Object> filterMap, PageDesc pageDesc);
    BbsSubject getBbsSubjectByID(String id);
    void createBbsSubject(BbsSubject bbsSubject);
    void updateBbsSubject(BbsSubject bbsSubject);
    void deleteBbsSubjectByID(String id);



    /**
     * 写入bbsPiece信息
     * @param bbsPiece
     */
    void createBbsPiece(BbsPiece bbsPiece);
    //用来添加BbsPiece字段中replyId的值
    void updateBbsPiece(BbsPiece bbsPiece);

    /**
     * 查询根据条件分页查询信息;
     * @param filterMap 需要过滤的字段;以key-value的类型保存到map集合中
     * @param pageDesc 分页参数设置
     * @return 符合条件的BbsPiece的集合
     */
    List<BbsPiece> listBbsPieces(Map<String, Object> filterMap, PageDesc pageDesc);

    /**
     * 根据pieceId获取一条BbsPiece中的pieceContent记录
     * @param pieceId
     * @return
     */
    String getBbsPieces(String pieceId);

    /**
     * 通过id删除消息记录
     * @param id
     */
    void deleteBbsPieceByID(String id);

}
