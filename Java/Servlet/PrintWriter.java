response.setContentType("text/html");
response.setContentType("application/json");

response.getWriter().write(new ObjectMapper().writeValueAsString(s));