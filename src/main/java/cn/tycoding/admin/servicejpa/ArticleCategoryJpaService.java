package cn.tycoding.admin.servicejpa;

import cn.tycoding.admin.entity.ArticleCategory;
import cn.tycoding.admin.service.BaseService;

/**
 * @auther TyCoding
 * @date 2018/10/22
 */
public interface ArticleCategoryJpaService extends BaseService<ArticleCategory> {

    /**
     * 根据文章ID删除
     * @param id
     */
    void deleteByArticleId(Long id);

    /**
     * 根据分类ID删除
     * @param id
     */
    void deleteByCategoryId(Long id);
}
