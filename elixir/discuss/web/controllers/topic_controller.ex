defmodule Discuss.TopicController do
  use Discuss.Web, :controller

  alias Discuss.Topic

  def delete(conn, %{"id" => topic_id}) do
  	
  	case Repo.delete(Topic, topic_id) do
    	{:ok, _topic} ->
    		conn
    		|> put_flash(:info, "Topic Deleted")
    		|> redirect(to: topic_path(conn, :index))
    	{:error, changeset} -> 
    		render conn, "index.html"
    end
  end

  def update(conn, %{"topic" => topic, "id" => topic_id}) do
  	old_topic = Repo.get(Topic, topic_id)
  	changeset = Topic.changeset(old_topic, topic)
    
    case Repo.update(changeset) do
    	{:ok, _topic} ->
    		conn
    		|> put_flash(:info, "Topic Updated")
    		|> redirect(to: topic_path(conn, :index))
    	{:error, changeset} -> 
    		render conn, "edit.html", changeset: changeset, topic: old_topic
    end
  end

  def edit(conn, %{"id" => topic_id}) do
  	topic = Repo.get(Topic, topic_id)
	changeset = Topic.changeset(topic)
  	
  	render conn, "edit.html", changeset: changeset, topic: topic
  end

  def index(conn, _params) do
	topics = Repo.all(Topic)

	render conn, "index.html", topics: topics
  end

  def new(conn, params) do
    changeset = Topic.changeset(%Topic{}, %{})

    render conn, "new.html", changeset: changeset
  end

  def create(conn, %{"topic" => topic}) do
  	changeset = Topic.changeset(%Topic{}, topic)
    
    case Repo.insert(changeset) do
    	{:ok, post} ->
    		conn
    		|> put_flash(:info, "Topic Created")
    		|> redirect(to: topic_path(conn, :index))
    	{:error, changeset} -> 
    		render conn, "new.html", changeset: changeset
    end
  end
end