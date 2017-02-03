package io.mattsommer.web;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {

  private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
  
  @RequestMapping("/")
  public String root(final HttpServletRequest request, Model model) {
    LOGGER.info(request.getMethod() + ": " + request.getRequestURI());
    model.addAttribute("requestMethod", request.getMethod());
    model.addAttribute("requestProtocol", request.getProtocol());
    model.addAttribute("requestScheme", request.getScheme());
    return "root";
  }

}
