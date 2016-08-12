function callAjax(method, object, path) {
	 $.ajax({
	      type: "PUT",
	      //contentType : "application/json",
	      //dataType : 'application/json',
	      url: path,
	      data: object,
	      success: function(e){
	    	  console.log("success ", e);
	      },
	      error: function(e){
	    	  console.log("error ", e);
	      }
	 });
}