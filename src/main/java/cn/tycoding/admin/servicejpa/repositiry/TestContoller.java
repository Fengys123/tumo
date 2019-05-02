package cn.tycoding.admin.servicejpa.repositiry;

import cn.tycoding.admin.entity.ArticleCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestContoller
{
    @Autowired
    ArticleCategoryRepository articleCategoryRepository;

    @RequestMapping("/ArticleCategory")
    public void test1()
    {
        //System.out.println(articleCategoryRepository.findAll().toString());
        /*System.out.println(articleCategoryRepository.findArticleCategoryByArticleIdAndAndCategoryId(24L,26L));
        if(articleCategoryRepository.existsArticleCategoriesByArticleIdAndAndCategoryId(24L,26L))
        {
            System.out.println("关系存在");
        }
        else
        {
            System.out.println("关系不存在");
        }*/


        long aid = 99L;
        long cid = 99L;
        ArticleCategory ac = new ArticleCategory();
        ac.setId(20L);
        ac.setArticleId(aid);
        ac.setCategoryId(cid);
        articleCategoryRepository.save(ac);

    }
}

