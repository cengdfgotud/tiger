/*package com.nbb.check;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CheckServerServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    JSONObject dataJSON = new JSONObject();
    dataJSON.put("state", 200);
    resp.setContentType("application/json; charset=utf-8");
    resp.getWriter().write(dataJSON.toString());
    resp.getWriter().flush();
    resp.getWriter().close();
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }
}*/
