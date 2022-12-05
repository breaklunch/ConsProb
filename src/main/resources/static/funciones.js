function eliminar(id) {
	swal({
		title: "Tas seguro",
		text: "Una vez borrado ya no lo ves en tu vida",
		icon: "warning",
		buttons: true,
		dangerMode: true,
	})
		.then((OK) => {
			if (OK) {
				$.ajax({
					url:"/eliminar/"+id,
					success: function(){
						console.log(res);
					} 
				});
				swal("Ya fue tu contacto", {
					icon: "succes",
				}).then((ok)=>{
					if(ok){
						location.href="/listar";
					}
				});
			} else {
				swal("Este on vera un dia mas");
			}
		});
}