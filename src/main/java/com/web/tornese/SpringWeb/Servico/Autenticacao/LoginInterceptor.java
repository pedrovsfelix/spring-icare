package com.web.tornese.SpringWeb.Servico.Autenticacao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import com.web.tornese.SpringWeb.Servico.CookieService;

@Component
public class LoginInterceptor implements HandlerInterceptor {
   @Override
   public boolean preHandle
      (HttpServletRequest request, HttpServletResponse response, Object handler) 
      throws Exception {
      
      try{
         if(CookieService.getCookie(request, "usuarioId") != null){
            return true;
         }
      }
      catch(Exception erro) {}
      
      response.sendRedirect("/login");
      return false;
   }
}