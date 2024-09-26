import './Cadastro.css'

function Cadastro(){
    return (<div class="create-account-screen">
    <form>
      <button id="create-account-close-button" class="close-button" type="button">x</button>
      <h2>Criar Conta</h2>
      <select>
        <option value="leitor">Leitor</option>
        <option value="editora">Editora</option>
      </select>
      <input type="text" placeholder="Nome"/>
      <input type="email" placeholder="Email"/>
      <input type="password" placeholder="Senha"/>
      <input type="password" placeholder="Confirmar Senha"/>
      <button type="submit">Criar Conta</button>
    </form>
  </div>  )
}

export default Cadastro