try {
    	          String subject="Registration";
    	          String msg="<h1>Hi! "+jTextField1.getText()+"</h1></br><h3> your Student id : "+id+"</h3><br>"
                          + "<p><i>You are registred on NIIT attendance management system</i></p>";   	          
    	          
    	          final String user="thakurshailendrasingh1991@gmail.com";//change accordingly  
    	          final String pass="@engineer";  
    	            
    	          //1st step) Get the session object    
    	          Properties props = new Properties();  
    	         //change accordingly  
    	          props.put("mail.smtp.user",user); 
    	          props.put("mail.smtp.password", pass);
    	          props.put("mail.smtp.host", "smtp.gmail.com"); 
    	         
    	          props.put("mail.smtp.port", "587 "); 
    	         // props.put("mail.debug", "true"); 
    	          props.put("mail.smtp.auth", "true"); 
    	          props.put("mail.smtp.starttls.enable","true"); 
    	          props.put("mail.smtp.EnableSSL.enable","true");
    	          props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    	          
    	          Session session = Session.getInstance(props, null);
    	          //session.setDebug(true);
 
    	          MimeMessage message = new MimeMessage(session);
    	          message.setFrom(new InternetAddress(user));

    	          // To get the array of addresses
    	          
    	              message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
    	          

    	          message.setSubject(subject);
    	          message.setContent(msg, "text/html");

    	          Transport transport = session.getTransport("smtp");
    	          
    	              transport.connect("smtp.gmail.com", user, pass);
    	              transport.sendMessage(message, message.getAllRecipients());
                      
       }catch(Exception e)
       {
           System.out.println(e);
       }
