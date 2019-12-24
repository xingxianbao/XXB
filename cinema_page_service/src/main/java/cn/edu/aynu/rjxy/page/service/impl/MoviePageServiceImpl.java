package cn.edu.aynu.rjxy.page.service.impl;

import cn.edu.aynu.rjxy.mapper.TbMovieMapper;
import cn.edu.aynu.rjxy.page.service.MoviePageService;
import cn.edu.aynu.rjxy.pojo.TbMovie;
import com.alibaba.dubbo.config.annotation.Service;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MoviePageServiceImpl implements MoviePageService {

    private String dataDir = "../cinema_upload\\src\\main\\webapp\\movieHtml/";

    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Autowired
    private TbMovieMapper movieMapper;


    @Override
    public boolean getMovieHTML(TbMovie movie) {
        try {
            Configuration configuration = freeMarkerConfigurer.getConfiguration();
            Template template = configuration.getTemplate("movie.ftl");

            Map<String,Object> model = new HashMap<>();

            List<TbMovie> moviesList = movieMapper.selectByExample(null);
            model.put("hotMovie",moviesList.subList(0,5));
            model.put("movie",movie);

            FileWriter writer = new FileWriter(dataDir+movie.getMovId()+".html");

            template.process(model,writer);
            writer.close();

            return true;
        } catch (IOException | TemplateException e) {
            e.printStackTrace();
        }

        return false;
    }
}
